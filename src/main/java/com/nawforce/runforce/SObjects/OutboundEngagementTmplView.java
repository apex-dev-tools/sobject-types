/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OutboundEngagementTmplView extends SObject {
	public static SObjectType$<OutboundEngagementTmplView> SObjectType;
	public static SObjectFields$<OutboundEngagementTmplView> Fields;

	public String BusinessArea;
	public String ExternalId;
	public String IconUrl;
	public Id Id;
	public String Purpose;
	public String SourcePath;
	public String TargetName;
	public String TargetType;
	public String TemplateCategory;
	public String TemplateDescription;
	public String TemplateDeveloperName;
	public String TemplateName;
	public String TemplateType;
	public String UsageType;

	public OutboundEngmtContentRsrc[] OutboundEngagementTemplate;

	public OutboundEngagementTmplView clone$() {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTmplView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTmplView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTmplView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OutboundEngagementTmplView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
