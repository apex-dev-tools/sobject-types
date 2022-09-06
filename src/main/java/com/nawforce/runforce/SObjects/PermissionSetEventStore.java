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
public class PermissionSetEventStore extends SObject {
	public static SObjectType$<PermissionSetEventStore> SObjectType;
	public static SObjectFields$<PermissionSetEventStore> Fields;

	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventSource;
	public Boolean HasExternalUsers;
	public Id Id;
	public String ImpactedUserIds;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String Operation;
	public String ParentIdList;
	public String ParentNameList;
	public Datetime PermissionExpiration;
	public String PermissionExpirationList;
	public String PermissionList;
	public String PermissionType;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String RelatedEventIdentifier;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserCount;
	public Id UserId;
	public User User;
	public String Username;

	public PermissionSetEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
