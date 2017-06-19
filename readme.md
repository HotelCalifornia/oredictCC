# DED REPO
maybe I'll pick it up again this summer, but then again, probably not

Overview
=========
This is an addon to the Computercraft Mod for Minecraft (v1.6.4) that adds Ore Dictionary item comparisons (in the form of a peripheral) to the Computercraft turtles.
  
  
In-Game
=======
To use OredictCC functions, you must first craft the turtle peripheral.  
1. Craft the Oredisk.  
2. Craft the Oredict Peripheral using the Oredisk.  
  
Next, place the turtle and the Oredict Peripheral together in a crafting table, creating an Intelligent Turtle.  
  
Finally, you can use the provided lua functions in any script.  
 
API
===
OredictCC currently provides two methods for comparing items.

Method | Description  
------------- | -------------  
isOfType(number) | Returns `true` if the item in the currently selected slot is the same type as the one in the slot given  
compareItems(number, number) | Returns `true` if the items in the given slots are of the same type 
