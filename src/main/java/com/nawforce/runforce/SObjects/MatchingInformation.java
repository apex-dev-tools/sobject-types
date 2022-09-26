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
public class MatchingInformation extends SObject {
	public static SObjectType$<MatchingInformation> SObjectType;
	public static SObjectFields$<MatchingInformation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EmailAddress;
	public String ExternalId;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPickedAsPreferred;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String PreferenceUsed;
	public Id SFDCIdId;
	public Contact SFDCId;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public MatchingInformation clone$() {throw new java.lang.UnsupportedOperationException();}
	public MatchingInformation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MatchingInformation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MatchingInformation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MatchingInformation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
