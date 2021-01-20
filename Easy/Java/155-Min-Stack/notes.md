## Min_Stack Problem:

**Test Case Input**

```
[
    "MinStack","push","push","push",
    "getMin","push","push","push",
    "push","push","top","push",
    "push","getMin","push","getMin",
    "push","push","getMin","push",
    "top","push","getMin","push",
    "push","push","push","getMin",
    "push","push","top","push","push",
    "getMin","pop","getMin","push",
    "push","getMin","getMin","push",
    "getMin","pop","push","push",
    "push","getMin","push","getMin",
    "getMin","getMin","pop","getMin",
    "push","push","getMin","top",
    "getMin","push","getMin","getMin",
    "getMin","getMin","push","getMin",
    "getMin","getMin","push","getMin",
    "push","getMin","push","getMin",
    "getMin","getMin","getMin","pop",
    "getMin","push","getMin","getMin",
    "push","push","pop","push",
    "getMin","push","top","top",
    "push","push","getMin","pop",
    "getMin","push","top","push",
    "getMin","push","getMin","getMin"
    ]

[
    [],[85],[-99],[67],[],
    [-27],[61],[-97],[-27],
    [35],[],[99],[-66],[],
    [-89],[],[4],[-70],
    [],[52],[],[54],
    [],[94],[-41],[-75],
    [-32],[],[5],[29],
    [],[-78],[-74],[],
    [],[],[-58],[-44],
    [],[],[-64],[],
    [],[-45],[-99],[-27],
    [],[-96],[],[],
    [],[],[],[26],
    [-58],[],[],[],
    [25],[],[],[],
    [],[33],[],[],
    [],[71],[],[-62],
    [],[-78],[],[],
    [],[],[],[],
    [-30],[],[],
    [85],[-15],[],[-40],
    [],[72],[],[],
    [18],[59],[],[],
    [],[-59],[],[10],
    [],[9],[],[]]
```

**Expected Output**

```
[
    null,null,null,null,
    -99,null,null,null,
    null,null,35,null,
    null,-99,null,-99,
    null,null,-99,null,
    52,null,-99,null,
    null,null,null,-99,
    null,null,29,null,
    null,-99,null,-99,
    null,null,-99,-99,
    null,-99,null,null,
    null,null,-99,null,
    -99,-99,-99,null,
    -99,null,null,-99,
    -58,-99,null,-99,
    -99,-99,-99,null,
    -99,-99,-99,null,
    -99,null,-99,null,
    -99,-99,-99,-99,
    null,-99,null,-99,
    -99,null,null,null,
    null,-99,null,72,
    72,null,null,-99,
    null,-99,null,-59,
    null,-99,null,-99,-99]
```

**My Output**

```
[null,null,null,null,-99,null,null,null,null,null,35,null,null,-99,null,-99,null,null,-99,null,52,null,-99,null,null,null,null,-99,null,null,29,null,null,-99,null,-99,null,null,-99,-99,null,-99,null,null,null,null,-99,null,-99,-99,-99,null,-99,null,null,-99,-58,-99,null,-99,-99,-99,-99,null,-99,-99,-99,null,-99,null,-99,null,-99,-99,-99,-99,null,-99,null,-99,-99,null,null,null,null,-99,null,-40,-40,null,null,-99,null,-99,null,-59,null,-99,null,-99,-99]
```