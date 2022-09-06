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
public class SessionPermSetActivation extends SObject {
	public static SObjectType$<SessionPermSetActivation> SObjectType;
	public static SObjectFields$<SessionPermSetActivation> Fields;

	public Id AuthSessionId;
	public AuthSession AuthSession;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PermissionSetGroupId;
	public PermissionSetGroup PermissionSetGroup;
	public Id PermissionSetId;
	public PermissionSet PermissionSet;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public SessionPermSetActivation clone$() {throw new java.lang.UnsupportedOperationException();}
	public SessionPermSetActivation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SessionPermSetActivation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SessionPermSetActivation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SessionPermSetActivation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
