# reflection points (10/09/2026) 

**1. What streaming means**

I have learned that streaming in graphic design and digital processing means sending or processing data continuously, bit by bit, instead of waiting for the whole file to load first. This helped me see that data does not always have to be complete before I can start working with it.

**2. Streaming versus downloading**

Downloading means I get the whole file first and only then use it. Streaming means I use the data as it arrives, without waiting for the full file. I realise the main difference is timing. With streaming I can start right away, which saves both waiting time and memory.

**3. Streaming in real calculations**

I understood that streaming becomes important when I have to calculate things on real, large data, and not just in theory. Earlier we discussed that 10 trillion numbers cannot fit in memory. So I cannot load them all and then calculate the variance. Instead, I can read one number at a time and update running totals.

The expectation formula makes this possible. Variance is σ² = E[X²] − (E[X])². This means I do not need to store every number. I only need to keep two running values as the data streams in: the sum of x, which gives me E[X], and the sum of x², which gives me E[X²]. As each number arrives, I add it to the first sum and add its square to the second sum. After all 10 trillion numbers have passed through, I divide both sums by n and put the results into the formula.

For me, this was a real link between theory and practice. Streaming is the method of feeding data in gradually, and the variance formula is simple enough to be updated on the fly without holding the whole dataset in memory.

**4. How XML connects to graphics**

I have learned that XML connects to graphics mostly as a way to describe or store graphic data in text form. It does not actually draw pixels. This was a useful correction to my earlier thinking, because I had assumed that anything linked to graphics must be about drawing.

**5. SVG as the main example**

SVG, or Scalable Vector Graphics, is the biggest example of this link. SVG is XML, a text based format that describes shapes, lines, colours, and paths using tags like circle or rect. Because it is plain text, I can read and edit it easily, change it with code, and resize it without losing quality. I find this powerful because a picture becomes something I can write and change like any other text.

**6. The purpose of XML**

The main purpose of XML is to store and transport data in a way that is both human readable and machine readable. Its structure is easy to organise and understand, so people and computers can both work with the same file.

**7. How XML does this**

XML does this by letting me define my own tags to describe data, instead of using a fixed set of tags like HTML. This showed me an important difference. HTML is mainly about how information is displayed, while XML is about describing what the information actually is. I now see XML as a way of giving meaning to data.
