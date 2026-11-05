# Objects, One More Time

**Your code compiles. That doesn't mean it works.**

Every puzzle in here compiles and runs. Most of them still have a bug. These are bugs
from real Follow-Along code this week, rewritten so no one's work is on screen.

This repo is for **practice**, in class on Thu Nov 5 and after. Your graded work is still in
your **FollowAlong4-Objects** fork.

## Get started

1. Click **Fork** (top right) → **Create fork**.
2. In IntelliJ: **File → New → Project from Version Control** → paste the URL of **your**
   fork → **Clone** → **Trust Project**.
3. Open a puzzle in `src/main/java`, starting with `block1/OneClassManyObjects.java`.

## How every puzzle works

1. **Read the code. Don't run it yet.**
2. **Write your guess** in the `MY GUESS` lines at the top of the file.
3. **Run it** with the green ▶ next to `main`.
4. **Wrong guess?** Good. That's the lesson. Don't change the code to match your guess.
   Write down *why* you were wrong.

## What is in here

| Folder (in `src/main/java`) | File | The question |
|---|---|---|
| `block1` | `OneClassManyObjects` | Two cars, or two names for one car? |
| `block1` | `HiddenBug` | Why does every quarterback have the same name? |
| `block2` | `MissingThis` | Where did Max go? |
| `block2` | `NoArgPizza` | A constructor with nothing to set |
| `block2` | `FreeConstructor` | Where did `new Car()` go? |
| `block3` | `CallFromMain` | Why does Java want `static`? |
| `block3` | `ClassInsideClass` | "It doesn't work because Counter isn't static" |
| `block3` | `Friends` | One box per object, or one box for everyone? |
| `block4` | `EmptyShelf` | What's in an array of objects? |
| `block5` | `BuildIt` | Build a class from an empty file |

## Words to use

| Say this | It means |
|---|---|
| **class** | The blueprint. Written once. |
| **object** | One thing built from the blueprint with `new`. You can build many. |
| **field** | A box that belongs to **one object**. Two objects = two boxes. Not "global." |
| **parameter** | A value handed into a method or constructor. Gone when it ends. |
| **local variable** | A box made inside a method. Gone when the method ends. |
| **`this`** | "This object." `this.name` is the field, not the parameter. |
| **`static`** | **One** box (or method) for the whole class, shared by every object. |
| **`null`** | An arrow that points at nothing. No object there yet. |

## Two habits

1. **Run your file after every step.** A red error you see now is a 2-minute fix.
2. **Turning code on:** delete **only** the `//` (or the `/*` and `*/`) around the code.
   Plain English outside a comment is not Java. Java will try to run it and fail.
