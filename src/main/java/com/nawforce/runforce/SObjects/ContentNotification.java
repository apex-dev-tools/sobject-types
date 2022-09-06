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
