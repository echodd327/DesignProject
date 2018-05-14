package suanfa.twocs;


/**
 * 二叉搜索树
 * @param <T>
 */
public class BSTree<T extends Comparable<T>>{
	
	
	BSNode<T> mRoot;
	
	public void insert(T key){
		BSNode<T> bsNode = new BSNode<T>(key, null, null, null);
		this.insert(this, bsNode);
	}
	/**
	 * 插入数据
	 * @param tree
	 * @param node
	 */
	public void insert(BSTree<T> tree, BSNode<T> node){
		BSNode<T> x = tree.mRoot;
		BSNode<T> y = null;
		int cmp;
		while(x != null){
			y = x;
			if(node.key.compareTo(x.key) < 0){
				x = x.left;
			}else{
				x = x.right;
			}
		}
		node.parent = y;
		if(y == null){
			tree.mRoot = node;
		}else{
			cmp = node.key.compareTo(y.key);
			if(cmp<0){
				y.left = node;
			}else{
				y.right = node;
			}
		}
	}
	
	/**
	 * 前序遍历：先遍历根节点，再遍历左子数，再遍历右子数
	 */
	public void preOrder(){
		preOrder(mRoot);
		System.out.println();
	}
	
	public void preOrder(BSNode<T> tree){
		if(tree!=null){
			System.out.print(tree.key +" ");
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}
	
	/**
	 * 中序遍历：先遍历左节点,访问根节点，再遍历右节点
	 */
	public void inOrder(){
		inOrder(mRoot);
		System.out.println();
	}
	public void  inOrder(BSNode<T> tree){
		if(tree != null){
			inOrder(tree.left);
			System.out.print(tree.key+" ");
			inOrder(tree.right);
		}
	}
	/**
	 * 后续遍历：先遍历左子数，后遍历右子数，访问根节点。
	 */
	public void postOrder(){
		postOrder(mRoot);
		System.out.println();
	}
	public void postOrder(BSNode<T> tree){
		if(tree!=null){
			postOrder(tree.left);
			postOrder(tree.right);
			System.out.print(tree.key+" ");
		}
	}
	
	public BSNode<T> search(T key){
		return serach(mRoot, key);
	}
	
	public BSNode<T> serach(BSNode<T> x, T key){
		if(x == null)
			return  x;
		
		int cmp = key.compareTo(x.key);
		if(cmp < 0){
			return serach(x.left, key);
		}else if(cmp > 0){
			return serach(x.right,key);
		}else{
			return x;
		}
	}
	/**
	 * 查找最大值
	 */
	public T maximun(){
		BSNode<T> p = maximun(mRoot);
		if(p!=null){
			return p.key;
		}
		return null;
	}
	public BSNode<T> maximun(BSNode<T> tree){
		if(tree == null)
			return null;
		BSNode<T> x = tree;
		while(x.right !=null){
			x = x.right;
		}
		return x;
	}
	/**
	 * 查找最小值
	 */
	public T minimun(){
		BSNode<T> p = minimun(mRoot);
		if(p!=null){
			return p.key;
		}
		return null;
		
	}
	public BSNode<T> minimun(BSNode<T> tree){
		if(tree == null)
			return null;
		BSNode<T> x = tree;
		while(x.left !=null){
			x = x.left;
		}
		return x;
	}

	/**
	 * 查找x的前驱:该节点左子数最大节点
	 * @param x
	 * @return
	 */
	public BSNode<T> predecessor(BSNode<T> x) {
		return null;
	}
	
	public class BSNode<T extends Comparable<T>>{
		
		T key;
		BSNode<T> parent;
		BSNode<T> left;
		BSNode<T> right;
		
		public BSNode(T key, BSNode<T> parent, BSNode<T> left, BSNode<T> right) {
			super();
			this.key = key;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		
	}
}