package adt.skipList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SkipListImpl<V> implements SkipList<V> {

	protected SkipNode<V> root;
	protected int level;
	protected int maxLevel;

	// SET THIS VALUE TO TRUE IF YOU ARE IMPLEMENTING MAX_LEVEL = LEVEL
	// SET THIS VALUE TO FALSE IF YOU ARE IMPLEMENTING MAX_LEVEL != LEVEL
	protected boolean useMaxLevelAsLevel;
	protected double probability = 0.5;
	protected SkipNode<V> NIL;

	public SkipListImpl(int maxLevel) {
		if (useMaxLevelAsLevel) {
			this.level = maxLevel;
		} else {
			this.level = 1;
		}
		this.maxLevel = maxLevel;
		root = new SkipNode(Integer.MIN_VALUE, maxLevel, new Integer(Integer.MIN_VALUE));
		NIL = new SkipNode(Integer.MAX_VALUE, maxLevel, new Integer(Integer.MAX_VALUE));
		connectRootToNil();
	}

	/**
	 * Faz a ligacao inicial entre os apontadores forward do ROOT e o NIL Caso
	 * esteja-se usando o level do ROOT igual ao maxLevel esse metodo deve
	 * conectar todos os forward. Senao o ROOT eh inicializado com level=1 e o
	 * metodo deve conectar apenas o forward[0].
	 */
	private void connectRootToNil() {
		root.forward[0] = NIL;
	}

	/**
	 * Metodo que gera uma altura aleatoria para ser atribuida a um novo no no
	 * metodo insert(int,V)
	 */
	private int randomLevel() {
		int randomLevel = 1;
		double random = Math.random();
		while (Math.random() <= probability && randomLevel < maxLevel) {
			randomLevel = randomLevel + 1;
		}
		return randomLevel;
	}

	@Override
	public void insert(int key, V newValue) {
		insert(key, newValue, randomLevel());
	}

	@Override
	public void insert(int key, V newValue, int height) {
		  SkipNode<V>[] update = new SkipNode[maxLevel]; 
		  SkipNode<V> x = root;
		  int index ; 
		  for(int i = this.level ; i > 0 ; i--) { 
			  index = i - 1;
			  while(x.forward[index] != null && x.forward[index].key < key) {
				  x = x.forward[index]; 
			  } 
			  update[index] = x; 
			  //6,6,9,12
		  } 
		  x = x.forward[0]; //19
		 if(x.key == key) { 
			 x.satteliteData = newValue; } 
		 else { 
			 int v = height; // Caso a altura gerada no  random seja maior que os niveis existentes , redefine o nivel
			 if(v > level) { 
				 for(int i = level; i <v; i ++) { 
					 update[i] = root; 
				}
				 level = v; 
			 } 
			 x = new SkipNode<V>(key, v, newValue); 
			 for(int i = 0 ;i < v;i++) { 
				 x.forward[i] = update[i].forward[i]; 
				 update[i].forward[i] = x; 
			 } 
		 }
	}

	@Override
	public void remove(int key) {
		SkipNode<V>[] update = new SkipNode[maxLevel];
		SkipNode<V> x = root;
		int index;
		for (int i = level; i > 0; i--) {
			index = i - 1;
			while (x.forward[index] != null && x.forward[index].key < key) { // anda na horizontal
				x = x.forward[index]; 
			}
			update[index] = x; // guarda o caminho
			//root,root,6,8
		}
		x = x.forward[0];
		if (x.key == key) {
			for (int i = 0; i < level; i++) {
				if (update[i].forward[i] != x) { // se não tiver apontando pro nó a ser removido pare!
					break;
				}
				update[i].forward[i] = x.forward[i]; // arruma o apontador 
			}
		}
	}

	@Override
	public int height() {
		if (size() != 0) {
			SkipNode<V> aux = root.forward[0];
			int largest = 0;
			while (!aux.equals(NIL)) {
				if (aux.height > largest) {
					largest = aux.height;
				}
				aux = aux.forward[0];
			}
			return largest;
		}
		return 1;
	}

	@Override
	public SkipNode<V> search(int key) {
		SkipNode<V> x = root;
		int index;
		for (int i = level; i > 0; i--) {
			index = i - 1;
			while (x.forward[index] != null && x.forward[index].key < key) {
				x = x.forward[index];
			}
		}
		x = x.forward[0];
		if (x.key == key) {
			return x;
		}
		return null;
	}

	@Override
	public int size() {
		int size = 0;
		SkipNode<V> x = root;

		while (x.forward[0] != NIL) {
			x = x.forward[0];
			size++;
		}
		return size;
	}

	@Override
	public SkipNode<V>[] toArray() {
		SkipNode<V>[] array = new SkipNode[size()+2];
		SkipNode<V> x = root;
		int i = 0;
		while (i < size() + 2) {
			array[i] = x;
			i++;
			x = x.forward[0];
		}
		return array;
	}
}
