import java.util.Random;

public class Secret implements Encryptable
{

	private String message;
	private int shift;
	private boolean encrypted;
	private Random generator;

	public String getMessage()
	{
		return this.message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public int getShift()
	{
		return this.shift;
	}

	public void setShift(int shift)
	{
		this.shift = shift;
	}

	public boolean isEncrypted()
	{
		return this.encrypted;
	}

	public void setEncrypted(boolean encrypted)
	{
		this.encrypted = encrypted;
	}

	public Secret(String message)
	{
		this.message = message;
		this.encrypted = false;
		generator = new Random();
		shift = generator.nextInt(10) + 5;
	}

	public String toString()
	{
		return message;
	}

  @Override
  public void encrypt() {
    String masked = "";
    for (int index = 0;index < message.length(); index++)
       masked = masked + (char) (message.charAt(index) + shift);
    message = masked;
    encrypted = true;
    
  }

  @Override
  public String decrypt() {
    String unmasked = "";
    for (int index = 0;index < message.length(); index++)
       unmasked = unmasked + (char) (message.charAt(index) - shift);
    message = unmasked;
    encrypted = false;
    return message;
  }

}