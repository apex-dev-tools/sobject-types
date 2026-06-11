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
public class ContentNotification extends SObject {
	public static SObjectType$<ContentNotification> SObjectType;
	public static SObjectFields$<ContentNotification> Fields;

	public Datetime CreatedDate;
	public Id EntityIdentifierId;
	public SObject EntityIdentifier;
	public String EntityType;
	public Id Id;
	public String Nature;
	public String Subject;
	public String Text;
	public Id UsersId;
	public User Users;

	public ContentNotification clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentNotification clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentNotification clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentNotification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentNotification clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
