class Process {
	int processNumber;
	int resources;
	int[] heldResources;
	int[] maxResources;
	
	Process(int[] held, int[] max, int n, int r) {
		heldResources = held;
		maxResources = max;
		processNumber = n;
		resources = r;
	}
	
	public int[] getHeldResources() {
		return heldResources;
	}
	
	public int getNameAsInt() {
		return processNumber;
	}
	
	public String getNameAsString() {
		return Integer.toString(processNumber);
	}
	
	boolean canRun(int[] available) {
		for (int i = 0; i < resources; i++) {
			if ((maxResources[i] - heldResources[i]) > available[i]) {
				return false;
			}
		}
		return true;
	}
	
	public void printInfo() {
		System.out.printf("Held resources for process " + Integer.toString(processNumber + 1) + ": ");
		for (int i = 0; i < resources; i++) {
			System.out.printf(heldResources[i] + " ");
		}
		System.out.println();
		System.out.printf("Max resources for process " + Integer.toString(processNumber + 1) + ": ");
		for (int i = 0; i < resources; i++) {
			System.out.printf(maxResources[i] + " ");
		}
		System.out.println();
	}
}