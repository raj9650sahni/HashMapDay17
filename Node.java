package com.Binarytree;

public class Node<K extends Comparable<K>> {
	public K key;
	public Node<K> left;
	public Node<K> right;

	public Node(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}