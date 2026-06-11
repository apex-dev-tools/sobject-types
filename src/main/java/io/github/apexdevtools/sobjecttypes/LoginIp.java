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
public class LoginIp extends SObject {
	public static SObjectType$<LoginIp> SObjectType;
	public static SObjectFields$<LoginIp> Fields;

	public String ChallengeMethod;
	public Datetime ChallengeSentDate;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsAuthenticated;
	public String SourceIp;
	public Id UsersId;
	public User Users;

	public LoginIp clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginIp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginIp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginIp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginIp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
