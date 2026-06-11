/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OutgoingEmail extends SObject {
	public static SObjectType$<OutgoingEmail> SObjectType;
	public static SObjectFields$<OutgoingEmail> Fields;

	public String BccAddress;
	public String CcAddress;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public String ExternalId;
	public String HtmlBody;
	public Id Id;
	public String InReplyTo;
	public String MessageId;
	public String References;
	public Id RelatedToId;
	public Name RelatedTo;
	public String Subject;
	public String TextBody;
	public String ToAddress;
	public String ValidatedFromAddress;
	public Id WhoId;
	public Name Who;
	public String[] ContentDocumentIds;
	public String[] ToIds;
	public String[] CcIds;
	public String[] BccIds;

	public ContentDocumentLink[] ContentDocumentLinks;
	public OutgoingEmailRelation[] OutgoingEmailRelations;

	public OutgoingEmail clone$() {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
