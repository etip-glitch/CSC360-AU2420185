# reflection points (10/09/2026) 
1. streaming in graphic design and digital processing means sending or processing data continuously, bit by bit, instead of waiting for the whole file to load first.
2. streaming vs downloading — downloading means getting the whole file first, then using it. streaming means using it as it arrives, without waiting for the full file.
3. streaming comes back in when you actually have to calculate these things on real, large data, not just the theory.

here's the connection: earlier we said 10 trillion numbers can't fit in memory, so you calculate variance by streaming, reading one number at a time and updating a running total instead of loading everything at once.

the expectation formula is what makes that possible. since variance is just:

σ² = E[X²] − (E[X])²

you don't need to store every number, you only need to keep track of two running values as data streams in:

sum of x (to get E[X] at the end)
sum of x² (to get E[X²] at the end)

so as each number arrives:
add it to a running sum
add its square to another running sum
once all 10 trillion numbers have streamed through, divide both sums by n to get E[X] and E[X²], then plug into the formula.

that's the real world link, streaming is the method of feeding data in gradually, and expectation/variance formulas are simple enough that they can be updated on the fly without needing the whole dataset in memory at once.

4. xml connects to graphics in a few ways, mostly as a way to describe or store graphic data in text form, rather than a way to actually draw pixels.
5. svg (scalable vector graphics) is the biggest example. svg is literally xml, a text based format that describes shapes, lines, colors, and paths using tags like <circle> or <rect>. since it's xml, it can be read and edited as plain text, resized without losing quality, and easily modified with code.
6. the main purpose of xml is to store and transport data in a way that's both human readable and machine readable, using a structure that's easy to organize and understand.
7. it does this by letting you define your own tags to describe data, instead of using a fixed set of tags like html does. so instead of just displaying information, xml focuses on describing what the information is.
