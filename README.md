# Animated-Vector-Drawable-Path-Morphing

Here’s my attempt at gathering all the required information and compressing it to something you can easily understand what is all about Animated vector drawable and how this is helping to animate some of complex animation. The reason I selected this topic is that Google has not provided stright forward examples to build animation, You may find bits of information here and there, but nothing solid. I am not going to make this complicated with many explanation and I will keep it short for you to start of .

I believe you already have basic understanding of SVG, Vector drawable. In simple, a vector drawable is a type of drawable that is scalable without getting pixelated or blurry. it is XML file as a set of points, lines, and curves along with its associated color information. 

The major advantage of using a vector drawable is image scalability. It can be scaled without loss of display quality, which means the same file is resized for different screen densities without loss of image quality. This results in smaller APK files and less developer maintenance.

VectorDrawable defines a static drawable object. Similar to the SVG format, internally each vector graphic is made up of path and group objects. Each path contains the geometry of the object's outline and group contains details for transformation. 
  
The AnimatedVectorDrawable class (and AnimatedVectorDrawableCompat for backward-compatibility) lets you animate the properties of a vector drawable, such as rotating it or changing the path data to morph it into a different image.

You should know what is Path Morphing : 
Path morphing animation technique that allows us to seamlessly transform the shapes of two paths(contains the geometrical points) by animating the differences in their drawing commands, The most important thing to consider when implementing a path morphing animation is whether or not the paths you want to morph are compatible.

In order to morph path A into path B the following conditions must be met:

1. A and B have the same number of drawing commands.
2. The ith drawing command in A must have the same type as the ith drawing command in B, for all i.
3. The ith drawing command in A must have the same number of parameters as the ith drawing command in B.

You will understand these rules when you start play around with Shape shifter tool.

Shape Shifter tool : 
Shape Shifter is a web-app that simplifies the creation of icon animations for Android, iOS, and the web.

This tool currently exports to standalone SVGs, SVG spritesheets, and CSS keyframe animations for the web, as well as to AnimatedVectorDrawable format for Android. 


https://shapeshifter.design/

There are very few simple steps to follow in shape shifter to produce your animations, 

Step 1 : Get all the shapes from your designer that you wanted animated, drawable should be either in SVG/Vector drawable.
Step 2 : Import shape1 drawable and shape 2 drawable into shapes shifter tool, each of one of those svg/vector drawable has path in it. Copy those paths.
Step 3 : Now you decide from what shape to what shape the animation should be play, based on that you keep copied path as path  from value and end value in Path Data option in tool.
Step 4: As soon as you mention From Path and End Path, you would see the message in the tool saying that "Path are incompatible to process". Basically this message means that two paths are having different number of geometrical points. In order to morph one shape to another, you need paths of same number of points. Shape shifter offer us ability to fix this issue instead of adding those points from ourselves. Hit the auto fix button to correct missing points. then animation is ready to play.
Step 5: Once your done, you have an export option to export it to Vector drawable, spreesheet, Animated Vector drawable. 

Remaining part of how to use exported Animated Vector drawable file in your app can be learn using this sample app 

Youtube tutorial - https://www.youtube.com/watch?v=2aq3ljlnQdI&feature=youtu.be

<img align="left" width="200" height="400" src="https://github.com/chethu/Animated-Vector-drawable-Path-Morphing-/blob/master/app/src/main/res/drawable/original_demo.gif">





<img align="left" width="200" height="400" src="https://github.com/chethu/Animated-Vector-drawable-Path-Morphing-/blob/master/app/src/main/res/drawable/demo_vedio.gif">
