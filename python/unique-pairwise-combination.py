"""
Problem: Generate All Unique Pairwise Combinations

Description:
    Read a list of flags from flags.txt and generate every possible
    pair of flags exactly once.

Example Input:
    flags_a
    flags_b
    flags_c

Expected Output:
    flags_a - flags_b
    flags_a - flags_c
    flags_b - flags_c

Important:
    The same combination should not be repeated.

    For example:
        flags_a - flags_b  -> valid
        flags_b - flags_a  -> duplicate, so we don't generate it.

Approach:
    1. Read all flags from the file.
    2. Store the flags in a list.
    3. Use two loops to generate pairs.
    4. Start the second loop from i + 1 so that each pair
       is generated only once.
"""


# Store all flags from the file
flags = []

# Open the file in read mode
with open("flags.txt", "r") as f:

    # Read the file one line at a time
    for line in f:

        # Remove newline/extra spaces and add the flag to the list
        flags.append(line.strip())


# Generate all unique pairs
for i in range(len(flags)):

    # Start from the next flag to avoid duplicate combinations
    for j in range(i + 1, len(flags)):

        # Print the pair
        print(flags[i] + " - " + flags[j])
