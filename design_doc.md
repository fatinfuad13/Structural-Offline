Content (interface)
├── Lesson
├── Course
├── Module
│     └── ModuleDecorator        (abstract, wraps Module)
│           ├── PracticeSet      (+$10)
│           └── LiveMentor       (+$20)
│
├── ContentCart
│     └── DiscountDecorator      (abstract, wraps Content or Cart)
│           └── MultiModuleDiscount  (-$15 when 2+ modules)
│
└── Main (test/demo)

Notes:
- `Content.java` is the common interface.
- `Lesson` is a leaf; `Course` contains Lessons; `Module` contains Courses.
- `ModuleDecorator` enforces wrapping a `Module` and is the base for module add-ons.
- `ContentCart` aggregates `Content` items; `DiscountDecorator` applies cart-level discounts like `MultiModuleDiscount`.

If you want this as a plain text file elsewhere or converted to an image, say which format.

