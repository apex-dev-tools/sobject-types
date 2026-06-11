/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoginAsEvent extends SObject {
	public static SObjectType$<LoginAsEvent> SObjectType;
	public static SObjectFields$<LoginAsEvent> Fields;

	public String Application;
	public String Browser;
	public Datetime CreatedDate;
	public String DelegatedOrganizationId;
	public String DelegatedUsername;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public Datetime LoginAccessChangeExpDate;
	public String LoginAccessChangeGranteeName;
	public String LoginAccessChangeGranteeType;
	public String LoginAsCategory;
	public Id LoginHistoryId;
	public SObject LoginHistory;
	public String LoginKey;
	public String LoginType;
	public String Platform;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Id ProfileId;
	public Profile Profile;
	public Id RoleId;
	public UserRole Role;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String TargetUrl;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public LoginAsEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
