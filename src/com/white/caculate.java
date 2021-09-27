package com.white;

public class caculate {
	// int n;
	// int[] a;

	// public caculate(int n) {
	// this.n = n;
	// this.a = new int[this.n];
	// this.a[0] = 0;
	// if (n > 1) {
	// this.a[1] = 1;
	// }
	// if (n > 2) {
	// for (int i = 2; i <= this.n - 1; i++) {
	// this.a[i] = this.a[i - 2] + this.a[i - 1];
	// }
	// }
	// }
	public int cacutale(int n) {
		if (n < 0) {
			return -1;
		} else {
			if (n == 0 || n == 1) {
				return n;
			} else {
				return cacutale(n - 1) + cacutale(n - 2);
			}
		}
	}
}
