<div data-target="readme-toc.content" class="Box-body px-5 pb-5">
            <article class="markdown-body entry-content container-lg" itemprop="text"><h1 dir="auto"><a id="user-content-adventuin-party" class="anchor" aria-hidden="true" href="#adventuin-party"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Adventuin Party</h1>
<p dir="auto">We are already in the middle of the run-up to Christmas, and at this time the penguins of the PGdP are also preparing for Christmas. We therefore call such a penguin Adventuin.</p>
<h5 id="user-content-adventuin" dir="auto"><a id="user-content-adventuin" class="anchor" aria-hidden="true" href="#adventuin"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Adventuin</h5>
<p dir="auto">An Adventuin has a name (a string), a height in centimeters (integer number), a color (for this there is a class <code>RgbColor</code> already created in the project), a (Christmas) hat and the language that it usually uses to speak. For hat and language we still need separate classes, we will use enums for them:</p>
<ol dir="auto">
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Implement enum HatType</span>
</div>
</div>
<p dir="auto">Create an Enum HatType with the values <code>SANTA_CLAUS</code>, <code>REINDEER</code>, <code>FISHY_HAT</code> and <code>NO_HAT</code>;</p></li>
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Implement enum Language</span>
</div>
</div>
<p dir="auto">Create an Enum Language with the values ENGLISH and GERMAN.
The class should have a method getLocalizedChristmasGreeting (String greeterName), which can be called on a Language value and returns a Christmas greeting in the respective language (as a string):</p>
<ul dir="auto">
<li><code>For GERMAN</code>: <code>Fröhliche Weihnachten wünscht dir</code> and after a space the <code>greeterName</code> with a <code>!</code> at the very end.</li>
<li><code>For ENGLISH</code>: <code>greeterName</code> immediately followed by a space and <code>wishes you a Merry Christmas!</code></li>
<li>If you can speak more languages, you are welcome to add them (this is optional and will not be tested).</li></ul></li>
</ol>
<ul dir="auto">
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Adventuin is present with all of its methods</span>
</div>
</div></li>
</ul>
<p dir="auto">Then we can create the class Adventuin which contains the attributes mentioned. Make the public getters getName, getHeight, getColor, getHatType and getLanguage available for this. You also need a public constructor that accepts the name, size, color, hat type and language in exactly this order. For your own testing it is advisable to overwrite toString (). A validity check (e.g. for zero) is not tested, but can be added.</p>
<p dir="auto">The <code>test_Adventuin_createExample</code> test does the following: <br>
<code>new Adventuin ("AdvenTux", 123, new RgbColor (3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);</code></p>
<h5 id="user-content-theparty" dir="auto"><a id="user-content-the-party" class="anchor" aria-hidden="true" href="#the-party"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>The Party</h5>
<p dir="auto">Now that the basics are done, we want to invite the Adventuins to a party and perform some interesting operations on them.
All methods of this subtask are created in the class AdventuinParty and should be static. Furthermore, every method receives a <code>java.util.List</code> with <code>Adventuin</code>s as parameters, which contains all participating adventuins. This list is always free of duplicates and free of <code>null</code>. They also don't return <code>null</code> in the methods, either directly or in any collections/maps.</p>
<ul dir="auto">
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Group participants by hats</span>
</div>
</div>
<p dir="auto">Implement the <code>groupByHatType</code> method. Return a <code>Map&lt;HatType, List &lt;Adventuin&gt;&gt;</code> in which the submitted participants are grouped by hats. The map should only contain the hat types that at least one participant has. (This is also the case with the <code>Maps</code> in the following subtasks)</p></li>
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Christmas greetings</span>
</div>
</div>
<p dir="auto">Implement the method <code>printLocalizedChristmasGreetings</code>. Nothing should be returned, but for all Adventuins in the list their personal Christmas greetings should be displayed on a line in the console. The string that the respective language object returns using <code>getLocalizedChristmasGreeting</code> with the name of the Adventuin as an argument should be used. The order should be determined by the height of the Adventuins, the smallest is allowed to say hello first, so sort the adventuins in ascending order according to their height. <br>
You can use <code>System.out.println(String)</code> to print text in the console.<br>
Example:</p></li>
</ul>
<div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate"><code>Christian wishes you <span>a</span> Merry Christmas!
</code></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="Christian wishes you a Merry Christmas!" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path fill-rule="evenodd" d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 010 1.5h-1.5a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-1.5a.75.75 0 011.5 0v1.5A1.75 1.75 0 019.25 16h-7.5A1.75 1.75 0 010 14.25v-7.5z"></path><path fill-rule="evenodd" d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0114.25 11h-7.5A1.75 1.75 0 015 9.25v-7.5zm1.75-.25a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-7.5a.25.25 0 00-.25-.25h-7.5z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>
<ul dir="auto">
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Adventuins with the longest names in their hat grouping</span>
</div>
</div>
<p dir="auto">Implement the method <code>getAdventuinsWithLongestNamesByHatType</code>.
Return a map <code>&lt;HatType, List&lt;Adventuin&gt;&gt;</code> in which those participants are grouped by hats whose name length is equal to the maximum name length (number of characters) in the group of adventuins with the same hat type. Since several Adventuins can have names of the same length, that too has to be a <code>List</code>.</p></li>
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Average color brightness by size</span>
</div>
</div>
<p dir="auto">Implement the method <code>getAverageColorBrightnessByHeight</code>.
Return a <code>Map&lt;Integer, Double&gt;</code> that contains the average brightness of the Adventuins' colors.
Grouping is done by size rounded in steps of 10 cm, that means for example from <code>95</code> to <code>104</code> all are grouped under integer <code>100</code>, and <code>105</code> to <code>114</code> under <code>110</code>, and so on. For the average brightness, the colors must be transformed to their brightness, for this we first convert them to 8-bit colors (value range 0 to 255) using the method <code>toRgbColor8Bit</code> and then we can use the formula <span><span><span>(0.2126∗R+0.7152∗G+0.0722∗B)/255(0. 2126∗R+0.7152∗G+0.0722∗B)/255</span><span><span><span></span><span>(</span><span>0</span><span>.</span><span>2</span><span>1</span><span>2</span><span>6</span><span>∗</span><span>R</span><span></span><span>+</span><span></span></span><span><span></span><span>0</span><span>.</span><span>7</span><span>1</span><span>5</span><span>2</span><span>∗</span><span>G</span><span></span><span>+</span><span></span></span><span><span></span><span>0</span><span>.</span><span>0</span><span>7</span><span>2</span><span>2</span><span>∗</span><span>B</span><span>)</span><span>/</span><span>2</span><span>5</span><span>5</span></span></span></span></span>. R, G and B are red, green and blue, the class RgbColor has suitable getters.</p></li>
</ul>
<p dir="auto"><em>(To experts: we just assume RgbColor is linear RGB and prefer to keep it simple).</em></p>
<ul dir="auto">
<li><div dir="auto"><div dir="auto">
    
    
    
    <span>Adventuin circle dance</span>
</div>
</div>
<p dir="auto">At the end of the party, our adventuins would like to perform a dance on an advent wreath in a large circle. It is particularly important to them that the size difference to the neighbors is as large as possible among adventuins with the same hat. To be able to measure that, the adventuins now want to calculate the absolute difference between the difference averages "greater than predecessor" and "smaller than predecessor" and thus obtain a measurement variable for the mixing of the variables in the dance circle.However, the Adventuins want to keep the freedom to dance next to each other in groups of the same size within the hat groups without worsening the statistics.
Implement the <code>getDiffOfAvgHeightDiffsToPredecessorByHatType</code> method. Return a <code>Map&lt;HatType, Double&gt;</code> that:</p></li>
<li><p dir="auto">Grouped by HatType and then within each group …</p></li>
<li><p dir="auto">Adventuin size differences to the respective predecessor (difference between successor and predecessor)</p></li>
<li><p dir="auto">… grouped according to the sign of the difference result (sign: <code>-1</code>, <code>0</code> or <code>1</code>)</p></li>
<li><p dir="auto">… with the value being absolute difference between</p></li>
<li><p dir="auto">… the average of all negative height differences (or <code>0.0</code> if not available) and</p></li>
<li><p dir="auto">… the average of all positive height differences (or <code>0.0</code> if not available).</p></li>
</ul>
<p dir="auto">calculated. It should be noted that the adventuins actually stand in a circle, and the predecessor (with the same hat type, of course) of the first adventuin of a hat type group is the last adventuin in this group. If a penguin is alone with his hat type, he is his own predecessor, but this is not a problem for the calculation (this then falls into the difference category <code>0</code>), and the absolute difference of the difference averages is therefore also 0 in its group.</p>
<ul dir="auto">
<li>For example, if we have two Adventuins with hat type SANTA_CLAUS, which have sizes 100 and 120, the first difference is 100-120 = -20, and the second difference 120-100 = 20; the absolute difference between them is 40.</li>
<li>If we have three Adventuins with hat type SANTA_CLAUS, which have the sizes 100 and 120 and 100, the first difference is 100-100 = 0, the second difference 120-100 = 20 and the third difference 100-120 = -20; the absolute difference between them is still 40. Here the case that two penguins of exactly the same size follow each other in the hat group, the statistics should not deteriorate.</li>
<li>But if we have four Adventuins with hat type SANTA_CLAUS, which have the sizes 100 and 120, 100 and 110, the first difference is 100-110 = -10, the second difference 120-100 = 20, the third difference 100-120 = - 20 and the fourth difference is 110-100 = 10. The averages are -15 for the negative and 15 for the positive differences, so the absolute difference is only 30.</li>
</ul>



            
            
</article>
          </div>
