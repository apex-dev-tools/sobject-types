/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
