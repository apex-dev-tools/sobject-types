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
public class LoginAsEvent extends SObject {
	public static SObjectType$<LoginAsEvent> SObjectType;
	public static SObjectFields$<LoginAsEvent> Fields;

	public String Application;
	public String Browser;
	public Datetime CreatedDate;
	public String DelegatedOrganizationId;
	public String DelegatedUsername;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public String LoginAsCategory;
	public Id LoginHistoryId;
	public SObject LoginHistory;
	public String LoginKey;
	public String LoginType;
	public String Platform;
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
