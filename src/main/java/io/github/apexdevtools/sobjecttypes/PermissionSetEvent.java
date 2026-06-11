/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PermissionSetEvent extends SObject {
	public static SObjectType$<PermissionSetEvent> SObjectType;
	public static SObjectFields$<PermissionSetEvent> Fields;

	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventSource;
	public String EventUuid;
	public Boolean HasExternalUsers;
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
	public Id ProfileId;
	public Profile Profile;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public Id RoleId;
	public UserRole Role;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserCount;
	public Id UserId;
	public User User;
	public String Username;

	public PermissionSetEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
