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
public class PrivacyRTBFRequestHistory extends SObject {
	public static SObjectType$<PrivacyRTBFRequestHistory> SObjectType;
	public static SObjectFields$<PrivacyRTBFRequestHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;
	public Id PrivacyRTBFRequestId;
	public PrivacyRTBFRequest PrivacyRTBFRequest;

	public PrivacyRTBFRequestHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequestHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequestHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequestHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequestHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
