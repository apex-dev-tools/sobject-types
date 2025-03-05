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
public class DataShellTntUpgradeEvent extends SObject {
	public static SObjectType$<DataShellTntUpgradeEvent> SObjectType;
	public static SObjectFields$<DataShellTntUpgradeEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorMessage;
	public Datetime EventCreationDateTime;
	public Datetime EventPublishDateTime;
	public String EventType;
	public String EventUuid;
	public String ReplayId;
	public String SchemaVersion;
	public String Status;

	public DataShellTntUpgradeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataShellTntUpgradeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataShellTntUpgradeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataShellTntUpgradeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataShellTntUpgradeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
