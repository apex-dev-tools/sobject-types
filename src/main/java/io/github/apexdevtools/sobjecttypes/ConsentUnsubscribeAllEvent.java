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
public class ConsentUnsubscribeAllEvent extends SObject {
	public static SObjectType$<ConsentUnsubscribeAllEvent> SObjectType;
	public static SObjectFields$<ConsentUnsubscribeAllEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventDetails;
	public String EventUuid;
	public String ReplayId;

	public ConsentUnsubscribeAllEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeAllEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeAllEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeAllEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeAllEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
