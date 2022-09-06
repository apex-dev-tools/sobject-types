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
public class UserEmailPreferredPerson extends SObject {
	public static SObjectType$<UserEmailPreferredPerson> SObjectType;
	public static SObjectFields$<UserEmailPreferredPerson> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Email;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PersonRecordId;
	public Name PersonRecord;
	public Datetime SystemModstamp;

	public UserEmailPreferredPersonShare[] Shares;

	public UserEmailPreferredPerson clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserEmailPreferredPerson clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserEmailPreferredPerson clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserEmailPreferredPerson clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserEmailPreferredPerson clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
