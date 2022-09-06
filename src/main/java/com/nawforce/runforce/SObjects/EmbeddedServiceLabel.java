/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class EmbeddedServiceLabel extends SObject {
	public static SObjectType$<EmbeddedServiceLabel> SObjectType;
	public static SObjectFields$<EmbeddedServiceLabel> Fields;

	public String CustomLabelName;
	public String DurableId;
	public String EmbeddedServiceConfigDeveloperName;
	public Id Id;
	public String LabelKey;

	public EmbeddedServiceLabel clone$() {throw new UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
