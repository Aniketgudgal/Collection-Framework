# Collection Framework Examples (Java)

Overview
--------
This repository contains small example programs that demonstrate usage of Java collection classes (primarily `ArrayList` and `Vector`). The examples are organized into two folders: `Array List` and `Vector`. Each file is a compact, self-contained Java class illustrating a specific operation or pattern.

Repository structure
--------------------
- **Root:**
	- [README.md](README.md) — this documentation.
	- [ListInterfaceExmp.java](ListInterfaceExmp.java) — example using the `List` interface.

- **Array List/**
	- [Array List/ArrayListClass.java](Array%20List/ArrayListClass.java) — basic `ArrayList` usage and examples.
	- [Array List/ArrayListConverstion.java](Array%20List/ArrayListConverstion.java) — conversions between arrays and `ArrayList` (note filename spelling).
	- [Array List/FreqNumber.java](Array%20List/FreqNumber.java) — frequency/count of numbers in a list/array.
	- [Array List/LongestSubArray.java](Array%20List/LongestSubArray.java) — finds the longest subarray according to example logic in the file.
	- [Array List/MaxNumber.java](Array%20List/MaxNumber.java) — finds the maximum element in a collection.
	- [Array List/MergeArrayList.java](Array%20List/MergeArrayList.java) — demonstrates merging two `ArrayList` instances.
	- [Array List/RotateArrayList.java](Array%20List/RotateArrayList.java) — rotates elements in an `ArrayList`.

- **Vector/**
	- [Vector/CheckSize.java](Vector/CheckSize.java) — checks `Vector` size and related operations.
	- [Vector/MethodContainsAll.java](Vector/MethodContainsAll.java) — demonstrates `containsAll` and related methods.
	- [Vector/ObjStore.java](Vector/ObjStore.java) — storing objects in a `Vector` and iteration.
	- [Vector/ParameterConsVect.java](Vector/ParameterConsVect.java) — examples of constructors / parameter use with `Vector`.
	- [Vector/SecondMax.java](Vector/SecondMax.java) — finds the second largest element in a collection.
	- [Vector/SetVectValue.java](Vector/SetVectValue.java) — setting values by index in a `Vector`.
	- [Vector/VectorCapacityCheck.java](Vector/VectorCapacityCheck.java) — demonstrates capacity behavior of `Vector`.

How to build and run
--------------------
Requirements:
- Java JDK 8 or later installed and `javac`/`java` on your PATH.

To compile all Java files from the repository root (Windows example):

```bash
javac -d out -sourcepath . ListInterfaceExmp.java Array\ List/*.java Vector/*.java
```

To run a specific example (replace the class name with the one you want):

```bash
java -cp out ListInterfaceExmp
```

Notes and conventions
---------------------
- Filenames in the `Array List` folder contain a space; when referencing them in commands or links, encode or quote the path (e.g., `Array\ List/ArrayListClass.java`).
- Some files have `.bak` copies in the same folders; these are backups and may contain older versions.

Contributing
------------
- Add small, focused examples that illustrate collection operations clearly.
- Follow the existing naming pattern and include a short comment at the top of each file describing the example's intent.

License
-------
This repository does not include a license file. If you want to apply an open-source license, add a `LICENSE` file at the repository root.

If you'd like, I can also:
- Add a short example README-run script to compile and run a selected example.
- Standardize filenames (remove spaces) and update imports/build instructions.

---
Updated README to document the project structure and usage.
