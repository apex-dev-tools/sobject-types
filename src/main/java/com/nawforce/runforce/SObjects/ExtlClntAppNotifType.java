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
public class ExtlClntAppNotifType extends SObject {
	public static SObjectType$<ExtlClntAppNotifType> SObjectType;
	public static SObjectFields$<ExtlClntAppNotifType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExtlClntAppNotifSettingsId;
	public ExtlClntAppNotifSettings ExtlClntAppNotifSettings;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPushByDefault;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String NotificationType;
	public Datetime SystemModstamp;

	public ExtlClntAppNotifType clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppNotifType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppNotifType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppNotifType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppNotifType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
