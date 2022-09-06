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
public class LoginGeo extends SObject {
	public static SObjectType$<LoginGeo> SObjectType;
	public static SObjectFields$<LoginGeo> Fields;

	public String City;
	public String Country;
	public String CountryIso;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Latitude;
	public Datetime LoginTime;
	public Decimal Longitude;
	public String PostalCode;
	public String Subdivision;
	public Datetime SystemModstamp;

	public LoginGeo clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginGeo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginGeo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginGeo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginGeo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
