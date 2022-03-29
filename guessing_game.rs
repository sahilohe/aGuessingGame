// guess the number 
use rand::Rng; // random number generator library
use std::cmp::Ordering; // comparing? and ordering the values (like of switch in C++)
use std::io; // standard input and output library

fn main() {
    println!("Guess the number!");
    let secret_number = rand::thread_rng().gen_range(1..101); // generates a random number from 1 to 100

    loop { //it's a loop obviously
        println!("Please input your guess.");
        let mut guess = String::new();

        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("You guessed: {}", guess);
        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Your guess is too small!"),
            Ordering::Greater => println!("Your guess is too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            }
        }
    }
}
