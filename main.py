from collections import deque

def main():
    movies = deque()
    snacks = deque()
    
    print("Enter movie 1 of 3: ")
    movies.append(input())
    print("Enter movie 2 of 3: ")
    movies.append(input())
    print("Enter movie 3 of 3: ")
    movies.append(input())
    print("Enter snack 1 of 3: ")
    snacks.append(input())
    print("Enter snack 2 of 3: ")
    snacks.append(input())
    print("Enter snack 3 of 3: ")
    snacks.append(input())
    print("Movies to watch are:", list(movies))
    print("Snacks available are:", list(snacks))
    print("Press S each time you finish a snack.")
    input_value = input()
    snacks.popleft()
    print(list(snacks))

    if input_value.lower() == "s":
        for i in range(4):
            input_value = input()
            snacks.popleft()
            print(list(snacks))
            if not snacks:
                print("No more Snacks.")
                break

if __name__ == "__main__":
    main()

