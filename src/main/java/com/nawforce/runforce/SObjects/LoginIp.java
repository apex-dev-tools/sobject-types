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
