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

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoginAsEventStream extends SObject {
	public static SObjectType$<LoginAsEventStream> SObjectType;
	public static SObjectFields$<LoginAsEventStream> Fields;

	public String Application;
	public String Browser;
	public Datetime CreatedDate;
	public String DelegatedOrganizationId;
	public String DelegatedUsername;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Datetime LoginAccessChangeExpDate;
	public String LoginAccessChangeGranteeName;
	public String LoginAccessChangeGranteeType;
	public String LoginAsCategory;
	public Id LoginHistoryId;
	public LoginHistory LoginHistory;
	public String LoginKey;
	public String LoginType;
	public String Platform;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Id ProfileId;
	public Profile Profile;
	public String ReplayId;
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

	public LoginAsEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginAsEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
