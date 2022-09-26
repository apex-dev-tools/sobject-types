/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DatacloudContact extends SObject {
	public static SObjectType$<DatacloudContact> SObjectType;
	public static SObjectFields$<DatacloudContact> Fields;

	public String City;
	public String CompanyId;
	public String CompanyName;
	public String ContactId;
	public String Country;
	public String CurrencyIsoCode;
	public String Department;
	public String Email;
	public String ExternalId;
	public String FirstName;
	public Id Id;
	public Boolean IsInCrm;
	public Boolean IsInactive;
	public Boolean IsOwned;
	public String LastName;
	public String Level;
	public String Phone;
	public String State;
	public String Street;
	public String Title;
	public Datetime UpdatedDate;
	public String Zip;

	public DatacloudContact clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
