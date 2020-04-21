/**
 * 
 */
package psa.springframework.examplebeans;

/**
 * Created by pyaesoneaung on 21/04/2020
 *
 */

public class FakeOther {
	
	  private String user;
	    private String password;
	    private String url;

	    public String getUser() {
	        return user;
	    }

	    public void setUser(String user) {
	        this.user = user;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getUrl() {
	        return url;
	    }

	    public void setUrl(String url) {
	        this.url = url;
	    }

		@Override
		public String toString() {
			return "FakeDataSource [user=" + user + ", password=" + password + ", url=" + url + "]";
		}

}
