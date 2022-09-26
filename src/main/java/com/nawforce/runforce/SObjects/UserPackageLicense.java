/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class UserPackageLicense extends SObject {
	public static SObjectType$<UserPackageLicense> SObjectType;
	public static SObjectFields$<UserPackageLicense> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PackageLicenseId;
	public PackageLicense PackageLicense;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public UserPackageLicense clone$() {throw new UnsupportedOperationException();}
	public UserPackageLicense clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public UserPackageLicense clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public UserPackageLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public UserPackageLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
