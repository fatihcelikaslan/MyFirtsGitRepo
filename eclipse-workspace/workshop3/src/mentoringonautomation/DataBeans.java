	package dataBeans;

	import com.qmetry.qaf.automation.core.ConfigurationManager;
	import com.qmetry.qaf.automation.data.BaseDataBean;
	import com.qmetry.qaf.automation.util.RandomStringGenerator.RandomizerTypes;
	import com.qmetry.qaf.automation.util.Randomizer;

	public class EditAccountInfoBean extends BaseDataBean {

		@Randomizer(prefix = "+1 248-890-", length = 4, type = RandomizerTypes.DIGITS_ONLY)
		private String homePhone;

		@Randomizer(prefix = "+1 860-590-", length = 4, type = RandomizerTypes.DIGITS_ONLY)
		private String mobilePhone;

		@Randomizer(prefix = "+1 248-890-", length = 4, type = RandomizerTypes.DIGITS_ONLY)
		private String workPhone;

		@Randomizer(prefix = "+1 248-890-", length = 4, type = RandomizerTypes.DIGITS_ONLY)
		private String otherPhone;

		public String getHomePhone() {
			if(ConfigurationManager.getBundle().getPropertyValue("platform").equalsIgnoreCase("android")){
				//Assume string comes as +1 111-111-1111 -->(111) 111-1111
				homePhone = homePhone.substring(3);
				homePhone = "(" + homePhone;
				homePhone = homePhone.replaceFirst("\\-", ") ");
			}
			return homePhone;
		}

		public String getMobilePhone() {
			if(ConfigurationManager.getBundle().getPropertyValue("platform").equalsIgnoreCase("android")){
				//Assume string comes as +1 111-111-1111 -->(111) 111-1111
				mobilePhone = mobilePhone.substring(3);
				mobilePhone = "(" + mobilePhone;
				mobilePhone = mobilePhone.replaceFirst("\\-", ") ");
			}
			
			return mobilePhone;
		}

		public String getWorkPhone() {
			if(ConfigurationManager.getBundle().getPropertyValue("platform").equalsIgnoreCase("android")){
				//Assume string comes as +1 111-111-1111 -->(111) 111-1111
				workPhone = workPhone.substring(3);
				workPhone = "(" + workPhone;
				workPhone = workPhone.replaceFirst("\\-", ") ");
			}
			return workPhone;
		}

		public String getOtherPhone() {
			if(ConfigurationManager.getBundle().getPropertyValue("platform").equalsIgnoreCase("android")){
				//Assume string comes as +1 111-111-1111 -->(111) 111-1111
				otherPhone = otherPhone.substring(3);
				otherPhone = "(" + otherPhone;
				otherPhone = otherPhone.replaceFirst("\\-", ") ");
			}
			return otherPhone;
		}

		public void setHomePhone(String homePhone) {
			this.homePhone = homePhone;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public void setWorkPhone(String workPhone) {
			this.workPhone = workPhone;
		}

		public void setOtherPhone(String otherPhone) {
			this.otherPhone = otherPhone;
		}

	}
}
