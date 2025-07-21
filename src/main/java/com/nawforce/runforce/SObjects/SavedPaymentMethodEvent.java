/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SavedPaymentMethodEvent extends SObject {
	public static SObjectType$<SavedPaymentMethodEvent> SObjectType;
	public static SObjectFields$<SavedPaymentMethodEvent> Fields;

	public String ChangeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;
	public Id SavedPaymentMethodId;
	public SavedPaymentMethod SavedPaymentMethod;

	public SavedPaymentMethodEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethodEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethodEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethodEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethodEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
