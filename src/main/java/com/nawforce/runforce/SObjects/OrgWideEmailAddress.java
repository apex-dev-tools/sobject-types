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
public class OrgWideEmailAddress extends SObject {
	public static SObjectType$<OrgWideEmailAddress> SObjectType;
	public static SObjectFields$<OrgWideEmailAddress> Fields;

	public String Address;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DisplayName;
	public Id Id;
	public Boolean IsAllowAllProfiles;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Purpose;
	public Datetime SystemModstamp;

	public OrgWideEmailAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
