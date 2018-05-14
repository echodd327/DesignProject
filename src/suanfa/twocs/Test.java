package suanfa.twocs;

import java.util.Scanner;

import suanfa.twocs.BSTree.BSNode;


public class Test {
	
	public static void main(String[] args) {
		BSTree<Integer> tree = new BSTree<>();
		
		tree.insert(1);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(6);
		
		tree.preOrder();  //前序遍历
		tree.inOrder();   //中序遍历
		tree.postOrder(); //后序遍历
		
//		Scanner scanner = new Scanner(System.in);
//		while(scanner.hasNext()){
//			String str = scanner.next();
//			BSTree<Integer>.BSNode<Integer> node = tree.search(Integer.valueOf(str));
//			System.out.println(node.key+","+node.parent.key +","+ (node.left==null?"":node.left.key)+","+(node.right==null?"":node.right.key));
//		}
		
		System.out.println(tree.maximun());
		System.out.println(tree.minimun());
	}
}



