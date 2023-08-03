package com.example.my_calculator.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_calculator.CalculatorButton

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp=8.dp,
    modifier: Modifier=Modifier,
    onAction:(CalculatorActions)->Unit
){
    Box(modifier = Modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)

        ) {
            Text(text=state.number1+(state.operation?.symbol?:"")+state.number2
            , textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 32.dp),
            fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.Yellow, maxLines = 1
            )
            Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol =
                    "AC", modifier =Modifier.background(Color.LightGray).aspectRatio(2f).weight(2f),
                    onClick = { onAction(CalculatorActions.Clear) })

                CalculatorButton(symbol =
                "Del", modifier =Modifier.background(Color.LightGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Delete) })


                CalculatorButton(symbol =
                "/", modifier =Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Operations(CalculatorOperation.Divide)) })

            }


            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol =
                "7", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(7)) })

                CalculatorButton(symbol =
                "8", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(8)) })

                CalculatorButton(symbol =
                "(", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(9)) })


                CalculatorButton(symbol =
                "X", modifier =Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Operations(CalculatorOperation.Multiply)) })

            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol =
                "4", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(7)) })

                CalculatorButton(symbol =
                "5", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(8)) })

                CalculatorButton(symbol =
                "6", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(9)) })


                CalculatorButton(symbol =
                "-", modifier =Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Operations(CalculatorOperation.Subtract)) })

            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol =
                "1", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(7)) })

                CalculatorButton(symbol =
                "3", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(8)) })

                CalculatorButton(symbol =
                "3", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Number(9)) })


                CalculatorButton(symbol =
                "+", modifier =Modifier.background(Orange).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Operations(CalculatorOperation.Add)) })

            }


            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)) {
                CalculatorButton(symbol =
                "0", modifier =Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick = { onAction(CalculatorActions.Number(0)) })

                CalculatorButton(symbol =
                ".", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Decimal) })

                CalculatorButton(symbol =
                "=", modifier =Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick = { onAction(CalculatorActions.Calculate) })


            }
        }
    }
}