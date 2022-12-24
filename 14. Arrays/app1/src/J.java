class J {

	public static void main(String[] args) {
			boolean[] elements = new boolean[3];
			System.out.println(elements[0] + "," + elements[1] + "," + elements[2]);
			elements[0] = true;
			elements[1] = elements[0];//true
			elements[2] = !elements[0];//false
			System.out.println(elements[0] + "," + elements[1] + "," + elements[2]);
			}
	}
