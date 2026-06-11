/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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
