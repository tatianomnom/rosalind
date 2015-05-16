import java.util.regex.Pattern

/**
 * Combing Through the Haystack
 */

def sampleDataset = ['GATATATGCATATACTT', 'ATAT']
def sampleOutput = [2, 4, 10]

def findLocationsSimple(String longStr, String shortStr) {
    def locations = []
    def longLength = longStr.length()
    def shortLength = shortStr.length()
    (0..(longLength - shortLength)).each {
        if (longStr.substring(it, it + shortLength) == shortStr) {
            locations.add(it + 1)
        }
    }
    return locations
}

def findLocationsRegex(String longStr, String shortStr) {
    def locations = []
    def pattern = Pattern.compile(shortStr)
    def matcher = pattern.matcher(longStr)

    //support overlapping matches
    def matchStart = 0;
    while (matcher.find(matchStart)) {
        locations.add(matcher.start() + 1)
        matchStart = matcher.start() + 1
    }
    return locations
}

assert findLocationsSimple(sampleDataset[0], sampleDataset[1]) == sampleOutput
assert findLocationsRegex(sampleDataset[0], sampleDataset[1]) == sampleOutput

println findLocationsSimple('str1', 'str2').join(' ')

