# reflection points (29/10/2026)

1. **image processing**
a digital image is a grid of tiny squares called pixels. each pixel holds a number for its brightness, or a few numbers for its color. image processing means applying math to these numbers. it has two purposes. one is to improve or edit an image, such as making it sharper, brighter, less noisy, or smaller. the other is to extract information, such as finding edges, reading text, or spotting a tumor in a scan. phone filters, face unlock, and satellite crop monitoring are everyday examples. it is closely related to computer vision, which goes one step further and tries to make the computer understand what the image shows.

2. **contrast**
contrast is the difference in brightness between the darkest and brightest parts of an image. in a high contrast image, dark and bright areas are far apart, so it looks bold and clear. in a low contrast image, most pixels have similar brightness, so it looks flat or washed out. to increase contrast, we push dark pixels darker and bright pixels brighter, for example by stretching the brightness range or using histogram equalization. this matters because later steps like segmentation and edge detection work much better when the contrast is good.

3. **segmentation (separating the object from the background)**
segmentation divides an image into regions so the computer knows which pixels belong to the object and which belong to the background. the simplest method is thresholding. we choose a brightness value, and every pixel above it is marked as object while the rest are marked as background. for example, a dark object on a white page can be separated with one threshold. this works well only when the object and background are clearly different. if the lighting is uneven or the colors are similar, simple thresholding fails. other methods group pixels with similar color, use edges to find boundaries, or use trained ai models. portrait mode and background removal tools work this way.

4. **filter**
a filter is a small grid of numbers, called a kernel or mask, that slides across the image one pixel at a time. at each position, it looks at the pixel and its neighbors, combines them using the numbers in the grid, and the result becomes the new value of that pixel. by changing the numbers in the grid, we get different effects such as blurring, sharpening, noise removal, or edge finding. this idea is important because one basic method (sliding a grid over the image) gives many different tools.

5. **linear filter**
a linear filter is a filter where the new pixel value is a weighted sum of the neighbors. we multiply each neighbor by its number from the grid and add everything up. nothing else happens, no sorting and no conditions. a blur filter is the easiest example. in a 3 by 3 area there are 9 pixels, and each gets a weight of 1/9, so the new pixel is the average of all 9. a filter that does not follow this rule is called non-linear. the median filter is an example. it sorts the neighbors and picks the middle value instead of adding them. it is useful for removing random specks of noise.

6. **edge detection**
an edge is a place where brightness changes suddenly, usually the border between an object and its background or between two parts of an object. edge detection finds these places. the computer checks each pixel against its neighbors, and where the change is big, it marks an edge. the output is usually a black image with white lines showing only the outlines. edges are useful because they tell the computer the shape of objects while ignoring unnecessary detail.

7. **simple edge detection compared with edge detection in general**
simple edge detection is the basic subtraction idea. it is fast and easy to understand, but it has weaknesses. noise, which means random tiny specks, can create big differences that are not real edges. it also checks in only one direction, so it can miss edges that run the other way. edge detection as a whole field includes better methods. sobel checks neighbors in both horizontal and vertical directions to measure how strongly brightness changes. canny goes further. it first blurs the image to reduce noise, then finds the changes, then thins the lines so they are one pixel wide, and finally keeps strong edges while dropping weak ones that are probably noise. this gives cleaner and more accurate outlines.

**overall understanding**
these topics work as a chain. contrast and filters prepare the image by making features clearer and reducing noise. then segmentation and edge detection pull out the objects and their outlines. the main lesson for me was that even complex tasks like finding an object in a photo come down to simple math on pixel numbers.
