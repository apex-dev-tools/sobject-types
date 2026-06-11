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
public class LogoutEvent extends SObject {
	public static SObjectType$<LogoutEvent> SObjectType;
	public static SObjectFields$<LogoutEvent> Fields;

	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public String LoginKey;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public LogoutEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LogoutEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LogoutEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LogoutEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LogoutEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
