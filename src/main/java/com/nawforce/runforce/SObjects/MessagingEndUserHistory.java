/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MessagingEndUserHistory extends SObject {
	public static SObjectType$<MessagingEndUserHistory> SObjectType;
	public static SObjectFields$<MessagingEndUserHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id MessagingEndUserId;
	public MessagingEndUser MessagingEndUser;
	public Object NewValue;
	public Object OldValue;

	public MessagingEndUserHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
