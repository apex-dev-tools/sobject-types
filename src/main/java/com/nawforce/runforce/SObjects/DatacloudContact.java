/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DatacloudContact extends SObject {
	public static SObjectType$<DatacloudContact> SObjectType;
	public static SObjectFields$<DatacloudContact> Fields;

	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CompanyId;
	public com.nawforce.runforce.System.String CompanyName;
	public com.nawforce.runforce.System.String ContactId;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Department;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String ExternalId;
	public com.nawforce.runforce.System.String FirstName;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsInCrm;
	public com.nawforce.runforce.System.Boolean IsInactive;
	public com.nawforce.runforce.System.Boolean IsOwned;
	public com.nawforce.runforce.System.String LastName;
	public com.nawforce.runforce.System.String Level;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String Title;
	public Datetime UpdatedDate;
	public com.nawforce.runforce.System.String Zip;

	public DatacloudContact clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudContact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
