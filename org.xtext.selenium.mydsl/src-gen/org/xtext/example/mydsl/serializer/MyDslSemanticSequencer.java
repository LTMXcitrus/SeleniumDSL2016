/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Alert;
import org.xtext.example.mydsl.myDsl.Click;
import org.xtext.example.mydsl.myDsl.Collection;
import org.xtext.example.mydsl.myDsl.DoAll;
import org.xtext.example.mydsl.myDsl.Fill;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.IsIn;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.Main;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Navigate;
import org.xtext.example.mydsl.myDsl.Not;
import org.xtext.example.mydsl.myDsl.SetCheckBox;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ALERT:
				sequence_Alert(context, (Alert) semanticObject); 
				return; 
			case MyDslPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case MyDslPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case MyDslPackage.DO_ALL:
				sequence_DoAll(context, (DoAll) semanticObject); 
				return; 
			case MyDslPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.IS_IN:
				sequence_IsIn(context, (IsIn) semanticObject); 
				return; 
			case MyDslPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case MyDslPackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case MyDslPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case MyDslPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case MyDslPackage.OBJECT:
				sequence_Object(context, (org.xtext.example.mydsl.myDsl.Object) semanticObject); 
				return; 
			case MyDslPackage.SET_CHECK_BOX:
				sequence_SetCheckBox(context, (SetCheckBox) semanticObject); 
				return; 
			case MyDslPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Alert
	 *     Alert returns Alert
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Alert(ISerializationContext context, Alert semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ALERT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ALERT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlertAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     innerhtml=STRING
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLICK__INNERHTML) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLICK__INNERHTML));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getInnerhtmlSTRINGTerminalRuleCall_1_0(), semanticObject.getInnerhtml());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Collection returns Collection
	 *
	 * Constraint:
	 *     obj+=Object+
	 */
	protected void sequence_Collection(ISerializationContext context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns DoAll
	 *     DoAll returns DoAll
	 *
	 * Constraint:
	 *     (coll=Collection (todo=Action | todo=Structure))
	 */
	protected void sequence_DoAll(ISerializationContext context, DoAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     nametag=STRING
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FILL__NAMETAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FILL__NAMETAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillAccess().getNametagSTRINGTerminalRuleCall_1_0(), semanticObject.getNametag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (cond=Condition actionThen=Action* actionElse=Action*)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns IsIn
	 *     IsIn returns IsIn
	 *
	 * Constraint:
	 *     (text=STRING (title=STRING | obj=Object))
	 */
	protected void sequence_IsIn(ISerializationContext context, IsIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Structure returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (cond=Condition milliseconds=INT actions=Action*)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Main returns Main
	 *
	 * Constraint:
	 *     (fileName=STRING browserName=STRING (orders+=Action | orders+=Structure)*)
	 */
	protected void sequence_Main(ISerializationContext context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Navigate
	 *     Navigate returns Navigate
	 *
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_Navigate(ISerializationContext context, Navigate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NAVIGATE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NAVIGATE__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Not
	 *     Not returns Not
	 *
	 * Constraint:
	 *     cond=Condition
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__COND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getCondConditionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     typeName=STRING
	 */
	protected void sequence_Object(ISerializationContext context, org.xtext.example.mydsl.myDsl.Object semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OBJECT__TYPE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OBJECT__TYPE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectAccess().getTypeNameSTRINGTerminalRuleCall_1_0(), semanticObject.getTypeName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns SetCheckBox
	 *     SetCheckBox returns SetCheckBox
	 *
	 * Constraint:
	 *     nametag=STRING
	 */
	protected void sequence_SetCheckBox(ISerializationContext context, SetCheckBox semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SET_CHECK_BOX__NAMETAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SET_CHECK_BOX__NAMETAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetCheckBoxAccess().getNametagSTRINGTerminalRuleCall_1_0(), semanticObject.getNametag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (obj=Object objName=STRING)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__OBJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__OBJ));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__OBJ_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getObjObjectParserRuleCall_1_0(), semanticObject.getObj());
		feeder.accept(grammarAccess.getStoreAccess().getObjNameSTRINGTerminalRuleCall_3_0(), semanticObject.getObjName());
		feeder.finish();
	}
	
	
}
